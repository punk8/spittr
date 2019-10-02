package com.punk.spitter.data;

import com.punk.spitter.Spitter;

public interface SpitterRepository {
    Spitter save(Spitter unsaved);
    Spitter findByUsername(String username);
}
