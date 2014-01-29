<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
				xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
				xmlns:xalan="http://xml.apache.org/xalan"
				xmlns="http://www.swin.edu.au/ict/road/smc"
				xmlns:fact="http://www.swin.edu.au/ict/road/fact"
				xmlns:role="http://www.swin.edu.au/ict/road/role"
				xmlns:serendip="http://www.ict.swin.edu.au/serendip/types"
				xmlns:term="http://www.swin.edu.au/ict/road/term"
				xmlns:contract="http://www.swin.edu.au/ict/road/contract"
				xmlns:player="http://www.swin.edu.au/ict/road/player">

  <xsl:output method="xml" indent="yes" xalan:indent-amount="2"/>
  
  <!-- "SMC" -->
  <xsl:template match="smc">
  
    <!-- Create element "SMC" -->
    <xsl:element name="SMC">
    
      <!-- Attributes -->
      <xsl:attribute name="name">
        <xsl:choose>
          <xsl:when test="count(../@name)>0 and string-length(../@name)>0">
            <xsl:value-of select="../@name"/>
          </xsl:when>
          <xsl:otherwise>
            <xsl:text>SMC</xsl:text>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:if test="count(@rulesDir) >0 and string-length(@rulesDir) > 0">
        <xsl:attribute name="dataDir">
          <xsl:value-of select="@rulesDir"/>
        </xsl:attribute>
      </xsl:if>
      <xsl:if test="count(@routingRuleFile) >0 and string-length(@routingRuleFile) > 0">
        <xsl:attribute name="routingRuleFile">
          <xsl:value-of select="@routingRuleFile"/>
        </xsl:attribute>
      </xsl:if>
      <xsl:if test="count(@compositeRuleFile) >0 and string-length(@compositeRuleFile) > 0">
        <xsl:attribute name="compositeRuleFile">
          <xsl:value-of select="@compositeRuleFile"/>
        </xsl:attribute>
      </xsl:if>
      
      <!-- Facts -->
      <xsl:if test="count(Fact)>0">
        <xsl:element name="Facts">
          <xsl:apply-templates select="Fact"/>
        </xsl:element>
      </xsl:if>
      
      <!-- "Roles" -->  
      <xsl:element name="Roles">
      	<xsl:apply-templates select="Role"/>
      </xsl:element>
      
      <!-- "Contracts" -->
      <xsl:element name="Contracts">
        <xsl:apply-templates select="Contract"/>
      </xsl:element>
      
      <!-- PlayerBindings -->
      <xsl:if test="count(PlayerBinding)>0">
        <xsl:element name="PlayerBindings">
          <xsl:apply-templates select="PlayerBinding"/>
        </xsl:element>
      </xsl:if>
      
      <!-- "OrganizerBinding" -->
      <xsl:if test="count(@OrganizerBinding) >0 and string-length(@OrganizerBinding) > 0">
        <xsl:element name="OrganizerBinding">
          <xsl:value-of select="@OrganizerBinding"/>
        </xsl:element>
      </xsl:if>
      
      <!-- "Description" -->
      <xsl:if test="count(@Description) >0 and string-length(@Description) > 0">
        <xsl:element name="Description">
          <xsl:value-of select="@Description"/>
        </xsl:element>
      </xsl:if>
      
      <!-- MessageAnalyzers -->
      <xsl:if test="count(MessageAnalyzer)>0">
        <xsl:element name="serendip:MessageAnalyzers">
          <xsl:apply-templates select="MessageAnalyzer"/>
        </xsl:element>
      </xsl:if>
      
    </xsl:element>
  </xsl:template>
  
  <!-- Facts -->
  <xsl:template match="Fact">
    <xsl:element name="fact:Fact">
      
      <!-- Attributes -->
      <xsl:if test="count(@name)>0 and string-length(@name)>0">
        <xsl:attribute name="name">
          <xsl:value-of select="@name"/>
        </xsl:attribute>
      </xsl:if>
      <xsl:if test="count(@source)>0 and string-length(@source)>0">
        <xsl:attribute name="source">
          <xsl:value-of select="@source"/>
        </xsl:attribute>
      </xsl:if>
      
      <!-- Identifier -->
      <xsl:if test="count(@Identifier)>0 and string-length(@Identifier)>0">
        <xsl:element name="fact:Identifier">
          <xsl:value-of select="@Identifier"/>
        </xsl:element>
      </xsl:if>
      
      <!-- Attributes -->
      <xsl:if test="count(Attribute)>0">
        <xsl:element name="fact:Attributes">
          <xsl:apply-templates select="Attribute"/>
        </xsl:element>
      </xsl:if>
      
    </xsl:element>
  </xsl:template>
  
  <!-- Attributes -->
  <xsl:template match="Attribute">
    <xsl:element name="fact:Attribute">
      <xsl:value-of select="."/>
    </xsl:element>
  </xsl:template>
  
  <!-- Roles -->
  <xsl:template match="Role">
  
    <!-- Create element "Role" -->
    <xsl:element name="role:Role">
    
      <!-- Attributes -->
      <xsl:attribute name="id">
    	<xsl:value-of select="@id"/>
      </xsl:attribute>
      <xsl:if test="count(@name) > 0 and string-length(@name) > 0">
        <xsl:attribute name="name">
    	  <xsl:value-of select="@name"/>
        </xsl:attribute>
      </xsl:if>
      
      <!-- "Description" -->
      <xsl:if test="count(@Description) > 0 and string-length(@Description) > 0">
        <xsl:element name="role:Description">
          <xsl:value-of select="@Description"/>
        </xsl:element>
      </xsl:if>
      
      <!-- LinkedFacts -->
      <xsl:if test="count(ExternalFactLink)>0 or count(FactLink)> 0">
        <xsl:element name="role:LinkedFacts">
          <xsl:apply-templates select="ExternalFactLink"/>
          <xsl:apply-templates select="FactLink"/>
        </xsl:element>
      </xsl:if>
      
      <!-- Management Responsibilities -->
      <xsl:if test="count(@ManagementResponsibilities) > 0 and string-length(@ManagementResponsibilities) > 0">
        <xsl:element name="role:ManagementResponsibilities">
          <xsl:value-of select="@ManagementResponsibilities"/>
        </xsl:element>
      </xsl:if>
      
      <!-- Tasks -->
      <xsl:if test="count(Task)>0">
        <xsl:element name="serendip:Tasks">
      	  <xsl:apply-templates select="Task"/>
        </xsl:element>
      </xsl:if>
    </xsl:element>
  </xsl:template>
  
  <!-- ExternalFactLink -->
  <xsl:template match="ExternalFactLink">
    <xsl:element name="Fact">
      
      <!-- Attributes -->
      <xsl:if test="count(@Fact)>0">
        <xsl:attribute name="name">
          <xsl:value-of select="@Fact"/>
        </xsl:attribute>
      </xsl:if>
      
      <!-- AcquisisionRegime -->
      <xsl:if test="count(AcquisitionRegime)>0">
        <xsl:apply-templates select="AcquisitionRegime"/>
      </xsl:if>
      
      <!-- ProvisionRegime -->
      <xsl:if test="count(ProvisionRegime)>0">
        <xsl:apply-templates select="ProvisionRegime"/>
      </xsl:if>
      
      <!-- OnChange -->
      <xsl:if test="count(@OnChange)>0 and string-length(@OnChange)>0">
        <xsl:element name="OnChange">
          <xsl:value-of select="@OnChange"/>
        </xsl:element>
      </xsl:if>
    </xsl:element>
  </xsl:template>
  
  <!-- AcquisitionRegime -->
  <xsl:template match="AcquisitionRegime">
    <xsl:element name="AcquisitionRegime">
      
      <!-- Attributes -->
      <xsl:attribute name="mode">
        <xsl:choose>
          <xsl:when test="count(@mode)>0 and string-length(@mode)>0">
            <xsl:value-of select="@mode"/>
          </xsl:when>
          <xsl:otherwise>
            <xsl:text>Active</xsl:text>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:if test="count(@SyncInterval)>0 and number(@SyncInterval)>0">
        <xsl:attribute name="SyncIntervale">
          <xsl:value-of select="@SyncInterval"/>
        </xsl:attribute>
      </xsl:if>
    </xsl:element>
  </xsl:template>
    
  <!-- ProvisionRegime -->
  <xsl:template match="ProvisionRegime">
    <xsl:element name="ProvisionRegime">
      
      <!-- Attributes -->
      <xsl:attribute name="mode">
        <xsl:choose>
          <xsl:when test="count(@mode)>0 and string-length(@mode)>0">
            <xsl:value-of select="@mode"/>
          </xsl:when>
          <xsl:otherwise>
            <xsl:text>Active</xsl:text>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:if test="count(@SyncInterval)>0 and number(@SyncInterval)>0">
        <xsl:attribute name="SyncIntervale">
          <xsl:value-of select="@SyncInterval"/>
        </xsl:attribute>
      </xsl:if>
    </xsl:element>
  </xsl:template>
  
  <!-- Task -->
  <xsl:template match="Task">
  
    <!-- Create element "Task" -->
    <xsl:element name="serendip:Task">
    
      <!-- Attributes -->
      <xsl:attribute name="id">
        <xsl:value-of select="@id"/>
      </xsl:attribute>
      <xsl:if test="count(@msgAnalyser) > 0 and string-length(@msgAnalyser) > 0">
        <xsl:attribute name="msgAnalyser">
          <xsl:value-of select="@msgAnalyser"/>
        </xsl:attribute>
      </xsl:if>
      <xsl:if test="count(@isMsgDriven) > 0 and string-length(@isMsgDriven) > 0">
        <xsl:attribute name="isMsgDriven">
          <xsl:value-of select="@isMsgDriven"/>
        </xsl:attribute>
      </xsl:if>
      
      <!-- Out -->
      <xsl:if test="count(Out) > 0">
        <xsl:apply-templates select="Out"/>      
      </xsl:if>
      
      <!-- In -->
      <xsl:if test="count(In) > 0">
        <xsl:apply-templates select="In"/>      
      </xsl:if>
      
      <!-- SrcMsg -->
      <xsl:if test="count(SrcMsg) > 0">
      
        <!-- Create element "SrcMsgs" -->
        <xsl:element name="serendip:SrcMsgs">
		  
		  <!-- Attributes -->
          <xsl:if test="count(Out) > 0">
            <xsl:attribute name="transformation">
              <xsl:value-of select="Out/@Transformation"/>
            </xsl:attribute>
          </xsl:if>
          
          <xsl:apply-templates select="SrcMsg"/>      
          
        </xsl:element>
      </xsl:if>
      
      <!-- ResultMsg -->
      <xsl:if test="count(ResultMsg) > 0">
        
        <!-- Create element "ResultMsgs" -->
        <xsl:element name="serendip:ResultMsgs">
          <xsl:apply-templates select="ResultMsg"/>
        </xsl:element>
      </xsl:if>
    </xsl:element>
  </xsl:template>
  
  <!-- Out -->
  <xsl:template match="Out">
  
    <!-- Create element "Out" -->
    <xsl:element name="serendip:Out">
          
      <!-- Attributes -->
      <xsl:attribute name="deliveryType"> <!-- Default value is "push" -->
        <xsl:choose>
          <xsl:when test="count(@deliveryType) > 0 and string-length(@deliveryType) > 0">
            <xsl:value-of select="@deliveryType"/>
          </xsl:when>
          <xsl:otherwise>
            <xsl:text>push</xsl:text>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:if test="count(@isResponse) > 0 and string-length(@isResponse) > 0">
        <xsl:attribute name="isResponse">
          <xsl:value-of select="@isResponse"/>
        </xsl:attribute>
      </xsl:if>
          
      <!-- Operation -->
      <xsl:apply-templates select="Operation"/>
    </xsl:element>  
  </xsl:template>
  
  <!-- In -->
  <xsl:template match="In">
  
    <!-- Create element "In" -->
    <xsl:element name="serendip:In">
          
      <!-- Attributes -->
      <xsl:attribute name="isResponse">
        <xsl:value-of select="@isResponse"/>
      </xsl:attribute>
          
      <!-- Operation -->
      <xsl:apply-templates select="Operation"/>
    </xsl:element>  
  </xsl:template>
  
  <!-- Operation -->
  <xsl:template match="Operation">
  
    <!-- Create element "Operation" -->
    <xsl:element name="term:Operation">
      
      <!-- Attributes -->
      <xsl:attribute name="name">
        <xsl:value-of select="@name"/>
      </xsl:attribute>
      
      <!-- Parameters -->
      <xsl:if test="count(Parameter) > 0">
        <xsl:element name="term:Parameters">
          <xsl:apply-templates select="Parameter"/>
        </xsl:element>
      </xsl:if>
      
      <!-- Return -->
      <xsl:if test="count(@Return) > 0 and string-length(@Return) > 0">
        <xsl:element name="term:Return">
          <xsl:value-of select="@Return"/>
        </xsl:element>      
      </xsl:if>      
    </xsl:element>
        
  </xsl:template>
  
  <!-- Parameter -->
  <xsl:template match="Parameter">
    
    <!-- Create element "Parameter" -->
    <xsl:element name="term:Parameter">
      <xsl:element name="term:Type">
        <xsl:value-of select="@Type"/>
      </xsl:element>
      <xsl:element name="term:Name">
        <xsl:value-of select="@Name"/>
      </xsl:element>
    </xsl:element>
    
  </xsl:template>
  
  <!-- SrcMsg -->
  <xsl:template match="SrcMsg">
  
    <!-- Create element "SrcMsg" -->
    <xsl:element name="serendip:SrcMsg">
    
      <!-- Attributes -->
      <xsl:attribute name="contractId">
        <xsl:value-of select="@contractId"/>
      </xsl:attribute>
      <xsl:attribute name="termId">
        <xsl:value-of select="@termId"/>
      </xsl:attribute>
      <xsl:attribute name="isResponse"><!-- Default value is "false" -->
        <xsl:choose>
          <xsl:when test="count(@isResponse) > 0 and string-length(@isResponse) > 0">
            <xsl:value-of select="@isResponse"/>
          </xsl:when>
          <xsl:otherwise>
            <xsl:text>false</xsl:text>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      
    </xsl:element>    
  </xsl:template>
  
  <!-- ResultMsg -->
  <xsl:template match="ResultMsg">
  
    <!-- Create element "ResultMsg" -->
    <xsl:element name="serendip:ResultMsg">
    
      <!-- Attributes -->
      <xsl:attribute name="contractId">
        <xsl:value-of select="@contractId"/>
      </xsl:attribute>
      <xsl:attribute name="termId">
        <xsl:value-of select="@termId"/>
      </xsl:attribute>
      <xsl:attribute name="isResponse">
        <xsl:value-of select="@isResponse"/>
      </xsl:attribute>
      <xsl:attribute name="transformation">
        <xsl:value-of select="@transformation"/>
      </xsl:attribute>
      
    </xsl:element>
  </xsl:template>
  
  <!-- Contract -->
  <xsl:template match="Contract">
    
    <!-- Create element "Contract" -->
    <xsl:element name="contract:Contract" >
      
      <!-- Attributes -->
      <xsl:attribute name="id">
    	<xsl:value-of select="@id"/>
      </xsl:attribute>
      <xsl:if test="count(@name) > 0 and string-length(@name) > 0">
        <xsl:attribute name="name">
    	  <xsl:value-of select="@name"/>
        </xsl:attribute>
      </xsl:if>
      <xsl:if test="count(@type) > 0 and string-length(@type) > 0">
        <xsl:attribute name="type">
    	  <xsl:value-of select="@type"/>
        </xsl:attribute>
      </xsl:if>
      <xsl:if test="count(@ruleFile) > 0 and string-length(@ruleFile) > 0">
        <xsl:attribute name="ruleFile">
    	  <xsl:value-of select="@ruleFile"/>
        </xsl:attribute>
      </xsl:if>
      
      <!-- LinkedFacts -->
      <xsl:if test="count(FactLink) > 0">
        <xsl:element name="contract:LinkedFacts">
          <xsl:apply-templates select="FactLink"/>
        </xsl:element>
      </xsl:if>
      
      <!-- Abstract -->
      <xsl:if test="count(@Abstract) > 0 and string-length(@Abstract) > 0">
        <xsl:element name="contract:Abstract">
    	  <xsl:value-of select="@Abstract"/>
        </xsl:element>
      </xsl:if>
      
      <!-- State -->
      <xsl:if test="count(@State) > 0 and string-length(@State) > 0">
        <xsl:element name="contract:State">
    	  <xsl:value-of select="@State"/>
        </xsl:element>
      </xsl:if>
      
      <!-- Terms -->
      <xsl:if test="count(Term)">
        <xsl:element name="contract:Terms">
    	  <xsl:apply-templates select="Term"/>
        </xsl:element>
      </xsl:if>
      
      <!-- RoleAID -->
      <xsl:element name="contract:RoleAID">
        <xsl:value-of select="@RoleAID"/>
      </xsl:element>
      
      <!-- RoleBID -->
      <xsl:element name="contract:RoleBID">
        <xsl:value-of select="@RoleBID"/>
      </xsl:element>
      
      <!-- Description -->
      <xsl:element name="contract:Description">
        <xsl:value-of select="@Description"/>
      </xsl:element>
    </xsl:element>
  </xsl:template>
  
  <!-- FactLink -->
  <xsl:template match="FactLink"> 
    <xsl:element name="Fact">
      <xsl:attribute name="name">
        <xsl:value-of select="@Fact"/>
      </xsl:attribute>
      
      <xsl:if test="count(@MonitorFact)>0 and string-length(@MonitorFact)>0">
        <xsl:attribute name="monitor">
          <xsl:value-of select="@MonitorFact"/>
        </xsl:attribute>
      </xsl:if>
      
      <xsl:if test="count(@ProvideContext)>0 and string-length(@ProvideContext)>0">
        <xsl:attribute name="provide">
          <xsl:value-of select="@ProvideContext"/>
        </xsl:attribute>
      </xsl:if>
      
    </xsl:element>
  </xsl:template>
  
  <!-- Term -->
  <xsl:template match="Term"> 
    <xsl:element name="term:Term">
      
      <!-- Attributes -->
      <xsl:attribute name="id">
    	<xsl:value-of select="@id"/>
      </xsl:attribute>
      <xsl:if test="count(@name) > 0 and string-length(@name) > 0">
        <xsl:attribute name="name">
    	  <xsl:value-of select="@name"/>
        </xsl:attribute>
      </xsl:if>
      <xsl:attribute name="messageType">
        <xsl:choose>
          <xsl:when test="count(@messageType) and string-length(@messageType) > 0">
		    <xsl:value-of select="@messageType"/>	        
          </xsl:when>
          <xsl:otherwise>
            <xsl:text>push</xsl:text>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:attribute name="deonticType">
        <xsl:choose>
          <xsl:when test="count(@deonticType) and string-length(@deonticType) > 0">
		    <xsl:value-of select="@deonticType"/>	        
          </xsl:when>
          <xsl:otherwise>
            <xsl:text>permission</xsl:text>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>

      <!-- Operation -->
      <xsl:apply-templates select="Operation"/>
      
      <!-- Direction -->
      <xsl:element name="term:Direction">
        <xsl:choose>
          <xsl:when test="count(@Direction) and string-length(@Direction) > 0">
		    <xsl:value-of select="@Direction"/>	        
          </xsl:when>
          <xsl:otherwise>
            <xsl:text>AtoB</xsl:text>
          </xsl:otherwise>
        </xsl:choose>        
      </xsl:element>      
      
      <!-- Description -->
      <xsl:if test="count(@Description) and string-length(@Description) > 0">
        <xsl:element name="term:Description">
          <xsl:value-of select="@Description"/>
        </xsl:element>
      </xsl:if>
      
    </xsl:element>
  </xsl:template>
  
  <!-- PlayerBinding -->
  <xsl:template match="PlayerBinding">
    <xsl:element name="player:PlayerBinding">
    
      <!-- Attributes -->
      <xsl:if test="count(@id)>0 and string-length(@id)>0">
        <xsl:attribute name="id">
          <xsl:value-of select="@id"/>
        </xsl:attribute>
      </xsl:if>
      <xsl:if test="count(@player)>0 and string-length(@player)>0">
        <xsl:attribute name="name">
          <xsl:value-of select="@player"/>
        </xsl:attribute>
      </xsl:if>
    
      <!-- Endpoint -->
      <xsl:if test="count(@Endpoint)>0 and string-length(@Endpoint)>0">
        <xsl:element name="player:Endpoint">
          <xsl:value-of select="@Endpoint"/>
        </xsl:element>
      </xsl:if>
    
      <!-- Implementation -->
      <xsl:if test="count(@Implementation)>0 and string-length(@Implementation)>0">
        <xsl:element name="player:Implementation">
          <xsl:value-of select="@Implementation"/>
        </xsl:element>
      </xsl:if>
    
      <!-- Roles -->
      <xsl:if test="count(@Role)>0 and string-length(@Role)>0">
        <xsl:element name="player:Roles">
          <xsl:element name="player:RoleID">
            <xsl:value-of select="@Role"/>
          </xsl:element>
        </xsl:element>
      </xsl:if>
      
      <!-- Description -->
      <xsl:if test="count(@Description)>0 and string-length(@Description)>0">
        <xsl:element name="player:Description">
          <xsl:value-of select="@Description"/>
        </xsl:element>
      </xsl:if>
            
    </xsl:element>
  </xsl:template>
  
  <!-- MessageAnalyzer -->
  <xsl:template match="MessageAnalyzer">
    <xsl:element name="serendip:MessageAnalyzer">
      
      <!-- Attributes -->
      <xsl:if test="count(@id)>0 and string-length(@id)>0">
        <xsl:attribute name="id">
          <xsl:value-of select="@id"/>
        </xsl:attribute>
      </xsl:if>
      <xsl:if test="count(@class)>0 and string-length(@class)>0">
        <xsl:attribute name="class">
          <xsl:value-of select="@class"/>
        </xsl:attribute>
      </xsl:if>
      
    </xsl:element>
  </xsl:template>
</xsl:stylesheet> 