<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="/RECHNUNGEN">
     	<xsl:apply-templates/>
	</xsl:template>

	<xsl:template match="RECHNUNG">
	  <xsl:if test="(./BRUTTO &lt; 1000) and (count(ADDRESSE) > 0)">
	    <xsl:variable name="date">
	   		<xsl:value-of select="./AUSTELLUNGSDATUM"/>
	    </xsl:variable>
	    <xsl:variable name="no_zeros">
	   		<xsl:value-of select="translate($date, '0', ' ')"/>
	    </xsl:variable>
	    <xsl:variable name="day">
	    	<xsl:if test="substring($date,10,1) > 0">
	    		<xsl:value-of select="substring($no_zeros,9,2)"/>
	    	</xsl:if>
	     	<xsl:if test="substring($date,10,1) = 0">
	    		<xsl:value-of select="substring($date,9,2)"/>
	    	</xsl:if>
	    	<xsl:text>. </xsl:text>
	    </xsl:variable>
	    <xsl:variable name="month">
	    	<xsl:if test="substring($date,7,1) > 0">
					<xsl:value-of select="substring($no_zeros,6,2)"/>
	    	</xsl:if>
	     	<xsl:if test="substring($date,7,1) = 0">
	    		<xsl:value-of select="substring($date,6,2)"/>
	    	</xsl:if>
	    	<xsl:text>. </xsl:text>
	    </xsl:variable>
    	<xsl:variable name="year">
    	  <xsl:value-of select="substring($date,1,4)"/>
    	<xsl:text>.</xsl:text>
    	</xsl:variable>
	     <xsl:variable name="new_date">
	    	  <xsl:value-of select="$day"/>
	    	  <xsl:value-of select="$month"/>
	    	  <xsl:value-of select="$year"/>
	    </xsl:variable>
	    <!-- Aufgabe2 -->
	    <xsl:value-of select="./ANREDE"/> <xsl:text> </xsl:text> <xsl:value-of select="./KUNDENNAME"/><xsl:text>.&#xa;Danke für die Zahlung von </xsl:text><xsl:value-of select="./BRUTTO"/><xsl:text> für die Rechnung vom </xsl:text><xsl:value-of select="$new_date"/><xsl:text>&#xa;Ich hoffe die </xsl:text> <xsl:value-of select="count(ITEM)"/> <xsl:text> Einzelposten sind zu Ihrer Zufriedenheit geliefert worden.&#xa;</xsl:text>
	  </xsl:if>
	</xsl:template>
</xsl:stylesheet>	