package com.google.firebase.components;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP = new ComponentRegistrarProcessor() { // from class: Za
        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.firebase.components.ComponentRegistrarProcessor
        public final List processRegistrar(ComponentRegistrar componentRegistrar) {
            return null;
        }
    };

    List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}
