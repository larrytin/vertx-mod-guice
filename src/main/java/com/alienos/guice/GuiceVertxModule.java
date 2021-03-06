/***
 * Copyright 2013 Jonathan Wagner
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alienos.guice;


import com.google.inject.Binder;
import com.google.inject.Module;
import org.vertx.java.core.Vertx;
import org.vertx.java.platform.Container;

/**
 * The module used by GuiceVertx
 */
public class GuiceVertxModule implements Module {

    private final Vertx vertx;
    private final Container container;

    public GuiceVertxModule(Vertx vertx, Container container) {
        this.vertx = vertx;
        this.container = container;
    }

    @Override
    public void configure(Binder binder) {
        binder.bind(Vertx.class).toInstance(vertx);
        binder.bind(Container.class).toInstance(container);
    }
}
