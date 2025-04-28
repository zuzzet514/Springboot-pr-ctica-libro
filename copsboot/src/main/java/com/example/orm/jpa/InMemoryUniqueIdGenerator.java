package com.example.orm.jpa;

import java.util.UUID;

public class InMemoryUniqueIdGenerator implements UniqueIdGenerator {
    @Override
    public UUID getNextUniqueId() {
        return UUID.randomUUID();
    }
}
