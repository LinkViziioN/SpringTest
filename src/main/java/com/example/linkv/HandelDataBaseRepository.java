package com.example.linkv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class HandelDataBaseRepository{
    @Autowired
    private MongoTemplate template;

    public void delete(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("name_punk").is(id));
        template.remove(query, DataBaseItem.class);
    }

    public void update(String id) {
        //todo
    }

    public void save(DataBaseItem dataBaseItem) {
        template.save(dataBaseItem);
    }
}
