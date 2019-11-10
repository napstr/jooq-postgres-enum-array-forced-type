package org.example.db;

import org.example.db.generated.tables.records.ExampleTableRecord;
import org.example.db.type.ExampleEnum;

import java.util.Optional;

import static org.example.db.generated.tables.ExampleTable.EXAMPLE_TABLE;
import static org.jooq.impl.DSL.selectFrom;

public class Repository {

    public Optional<ExampleTableRecord> findOne(int id) {
        return selectFrom(EXAMPLE_TABLE)
                .where(EXAMPLE_TABLE.ID.eq(id))
                .fetchOptional();
    }

    public void asd() {
        ExampleTableRecord record = findOne(42).orElseThrow();
        ExampleEnum correctEnum = record.getEnum();
        ExampleEnum[] wrongEnumArray = record.getEnums();
    }
}
