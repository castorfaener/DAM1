<ul> 
{ 
for $x in doc("artistas.xml")/artistas/artista 
where $x/pais = "España"  
return <li>{data($x/nombreCompleto)}</li>
} 
</ul> (:Lista HTML de los nombres nacidos en España:)