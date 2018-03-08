package com.mycompany.teste;

import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.model.CreateCollectionOptions;
import com.mongodb.client.model.ValidationOptions;
import org.bson.Document;

/**
 *
 * @author Bernardo
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient();
        MongoDatabase database = mongoClient.getDatabase("CromosDigital");
        MongoCollection<org.bson.Document> coll = database.getCollection("equipas");

        Block<Document> printBlock = new Block<Document>() {
            @Override
            public void apply(final Document document) {
                System.out.println(document.toJson());
            }
        };

        coll.find().forEach(printBlock);
        
        Document doc = new Document("NomeEquipa", "Felgueiras FC")
                .append("TreinadorEquipa", "Não sei")
                .append("AnoFundacao", 1999)
                .append("Estadio", "Intermache")
                .append("Presidente", "x")
                .append("URL", "www.felgueirasfc.com")
                .append("ObservacoesEquipa", "NA/NE")
                .append("CidadeEquipa", "Felgueiras");
        
        coll.insertOne(doc);
    }

}
