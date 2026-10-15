package com.google.firebase.ktx;

import S3.e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d3.AbstractC1654b;
import java.util.Collections;
import java.util.List;
import n3.C1814a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1814a> getComponents() {
        List<C1814a> singletonList = Collections.singletonList(AbstractC1654b.n("fire-core-ktx", "20.4.2"));
        e.d(singletonList, "singletonList(...)");
        return singletonList;
    }
}
