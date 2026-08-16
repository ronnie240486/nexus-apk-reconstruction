package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ComponentMonitor implements ComponentRegistrarProcessor {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$processRegistrar$0(String str, Component component, ComponentContainer componentContainer) {
        try {
            FirebaseTrace.pushTrace(str);
            return component.getFactory().create(componentContainer);
        } finally {
            FirebaseTrace.popTrace();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final Component<?> componentWithFactory : componentRegistrar.getComponents()) {
            final String name = componentWithFactory.getName();
            if (name != null) {
                componentWithFactory = componentWithFactory.withFactory(new ComponentFactory(name, componentWithFactory) { // from class: Ya

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ String f3971a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ Component f3972b;

                    /* JADX WARN: Invalid debug info offset */
                    @Override // com.google.firebase.components.ComponentFactory
                    public final Object create(ComponentContainer componentContainer) {
                        return null;
                    }
                });
            }
            arrayList.add(componentWithFactory);
        }
        return arrayList;
    }
}
