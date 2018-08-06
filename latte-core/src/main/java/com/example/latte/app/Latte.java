package com.example.latte.app;

import android.content.Context;

import java.util.Objects;
import java.util.WeakHashMap;

/**
 * Created by ljwhe on 2018/8/6.
 */

public final class Latte {
    public static Configurator init(Context context) {
        getConfiguration().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static WeakHashMap<String, Object> getConfiguration(){
        return Configurator.getInstance().getLatteConfigs();
    }
}
