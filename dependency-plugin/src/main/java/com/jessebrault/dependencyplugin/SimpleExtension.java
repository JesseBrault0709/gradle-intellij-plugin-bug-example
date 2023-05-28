package com.jessebrault.dependencyplugin;

import com.google.common.eventbus.EventBus;

public final class SimpleExtension {

    private EventBus eventBus;

    public static void greet() {
        System.out.println("Hello!");
    }

}
