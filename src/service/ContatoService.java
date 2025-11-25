package service;

import java.util.ArrayList;

public class ContatoService {

    private ArrayList<Contato> lista = new ArrayList<>();

    private CsvService csv = new CsvService();
   // private JsonService json = new JsonService();
   // private YamlService yaml = new YamlService();
   // private XmlService xml = new XmlService();
    private ToonService toon = new ToonService();

    public void adicionar(Contato c) {
        lista.add(c);
        csv.salvarCSV(lista);
        atualizarOutrosFormatos();
    }

    private void atualizarOutrosFormatos() {
       // json.salvarJSON(lista);
     //   yaml.salvarYAML(lista);
      //  xml.salvarXML(lista);
        toon.salvarTOON(lista);
    }
}
