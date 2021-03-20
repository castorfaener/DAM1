for $x in doc("impresoras.xml")/impresoras/impresora
where $x/tamaño='A3'
return data(<impresora>{$x/marca, $x/modelo}</impresora>)
(:Marca y modelo de las impresoras con tamaño A3:)