for $x in doc("artistas.xml")/artistas/artista where number($x/nacimiento) < 1500 return data($x/nombreCompleto) (:Nombre de los nacidos antes de 1500:)