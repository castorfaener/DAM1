<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
<xsl:template match="/">
  <html>
  <body>
  <h2>Artistas</h2>
    <table border="1">
      <tr bgcolor="#AAAAAA">
        <th>Código</th>
        <th>Nombre</th>
        <th>Año Nacimiento</th>
        <th>Año fallecimiento</th>
        <th>País</th>
        <th>Página Web</th>
      </tr>
      <xsl:for-each select="artistas/artista">
        <xsl:sort select="nacimiento" order="ascending"/>
        
        
      <xsl:if test="nacimiento>1500">
      <tr>
        <td><xsl:value-of select="@cod"/></td>
        <td><xsl:value-of select="nombreCompleto"/></td>
        <td><xsl:value-of select="nacimiento"/></td>
        <xsl:choose>
          <xsl:when test="fallecimiento!=null">
            <td><xsl:value-of select="fallecimiento"/></td>
          </xsl:when>
          <xsl:otherwise>
            <td>Desconocido</td>
          </xsl:otherwise>
        </xsl:choose>
        
        <td><xsl:value-of select="pais"/></td>
        <td>
          <a>
            <xsl:attribute name="href">
              <xsl:value-of select="fichaCompleta"/>
            </xsl:attribute>
            Saber más
          </a>
        </td>
      </tr>
    </xsl:if>
      </xsl:for-each>
    </table>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>

