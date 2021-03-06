package de.holisticon.dropwizard.weld.example.util;

import com.google.common.base.Supplier;

import javax.inject.Inject;
import javax.inject.Named;

public class BarSupplier implements Supplier<String> {

    @Inject
    @Named("foo")
    private String foo;

    @Override
    public String get() {
        return foo;
    }
}
