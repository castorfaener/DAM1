for $x in doc("artistas.xml")/artistas/artista where not($x/fallecimiento) return $x/nombreCompleto (:Nombre de los que no tienen fecha de fallecimiento:)