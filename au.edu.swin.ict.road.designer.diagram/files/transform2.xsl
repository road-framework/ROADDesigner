<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  version="1.0">

  <xsl:output method="xml" />

  <xsl:template match="//smc/Role[1]">
    <xsl:element name="Role">
      <xsl:value-of select="@name"/>
    </xsl:element>
  </xsl:template>
</xsl:stylesheet> 