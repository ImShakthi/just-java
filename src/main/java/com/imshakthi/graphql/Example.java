package com.imshakthi.graphql;

import org.neo4j.driver.*;
import org.neo4j.driver.Record;

import static org.neo4j.driver.Values.parameters;

public class Example {
    public static void main(String...args) {

        Driver driver = GraphDatabase.driver("bolt://<HOST>:<BOLTPORT>",
                AuthTokens.basic("<USERNAME>","<PASSWORD>"));

        try (Session session = driver.session(SessionConfig.forDatabase("neo4j"))) {

            String cypherQuery =
                    "MATCH (movie:Movie {title:$favorite})<-[:ACTED_IN]-(actor)-[:ACTED_IN]->(rec:Movie)\n" +
                            " RETURN distinct rec.title as title LIMIT 20";

            var result = session.readTransaction(
                    tx -> tx.run(cypherQuery,
                                    parameters("favorite","The Matrix"))
                            .list());

            for (Record record : result) {
                System.out.println(record.get("title").asString());
            }
        }
        driver.close();
    }
}
