<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output indent="yes" method="xml" encoding="utf-8" omit-xml-declaration="yes"/>

	<xsl:template match="/RECHNUNGEN">
	    <xsl:copy>
	         <xsl:for-each select="./RECHNUNG">
		          <xsl:variable name="date">
		              <xsl:value-of select="./AUSTELLUNGSDATUM"/>
		            </xsl:variable>
		            <xsl:if test="number(translate($date, '-', '')) > 20101231">
                     <xsl:copy>
      					<xsl:apply-templates/>
                     </xsl:copy>
                    </xsl:if>
	       </xsl:for-each>
	    </xsl:copy>
	</xsl:template>

    <xsl:template match="@*|node()">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()" />
        </xsl:copy>
    </xsl:template>
    
    <!-- Ignorieren-->
    <xsl:template match="UNTERNEHMENDATEN" />
    <xsl:template match="UST-ID" />
    <xsl:template match="STEUERNUMMER" />
    <!-- KUNDEDATEN-->
    <xsl:template match="KUNDEDATEN">
            <!-- Man braucht diese 2 Elemente für Aufgabe2, deren Nutzung aber an der Aufgabenstellung widersprochen wird-->
            <xsl:copy-of select="ANREDE" />
            <xsl:copy-of select="KUNDENNAME" />
            <xsl:if test="contains(./ANREDE, 'Herr') or contains(./ANREDE, 'Frau')">
                    <xsl:copy-of select="./ADDRESSE"/>
            </xsl:if>
       </xsl:template>
       <xsl:template match="ZAHLUNGSART">
           <xsl:copy>
           </xsl:copy>
       </xsl:template>
          <xsl:template match="ENTGELT">
             <xsl:copy-of select="BRUTTO"/>
           </xsl:template>
           
      	<xsl:template match="LEISTUNG">
	            <xsl:apply-templates select="@*|node()" />
    	</xsl:template>
    	
		<xsl:template match="ITEM">
           <xsl:copy>
               <xsl:choose>
                   <xsl:when test="count(../ITEM) &gt; 1">
                            <xsl:element name="POSITION"> 
                                   <xsl:value-of select="count(./preceding-sibling::ITEM)+1" />
                               </xsl:element>
                               <xsl:copy-of select="BESCHREIBUNG"/>
                               <xsl:copy-of select="GESAMTPREIS"/>
                   </xsl:when>
                   <xsl:otherwise>
                               <xsl:copy-of select="./BESCHREIBUNG"/>
                               <xsl:copy-of select="./GESAMTPREIS"/>
                   </xsl:otherwise>
               </xsl:choose>
           </xsl:copy>
       </xsl:template>
       
</xsl:stylesheet>
