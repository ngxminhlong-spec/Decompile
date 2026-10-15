package com.google.firebase;

import D3.a;
import D3.b;
import D3.c;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ads.C0574em;
import com.google.android.gms.internal.play_billing.B;
import com.google.firebase.components.ComponentRegistrar;
import d3.AbstractC1654b;
import d3.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import n3.C1814a;
import n3.i;
import n3.q;
import v3.C2032c;
import v3.C2033d;
import v3.InterfaceC2034e;
import v3.InterfaceC2035f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(c.class));
        for (Class cls : new Class[0]) {
            B.g(cls, "Null interface");
            hashSet.add(q.a(cls));
        }
        i iVar = new i(a.class, 2, 0);
        if (hashSet.contains(iVar.f14132a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(iVar);
        arrayList.add(new C1814a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new b(0), hashSet3));
        q qVar = new q(h3.a.class, Executor.class);
        C0574em c0574em = new C0574em(C2032c.class, new Class[]{InterfaceC2034e.class, InterfaceC2035f.class});
        c0574em.a(i.a(Context.class));
        c0574em.a(i.a(g.class));
        c0574em.a(new i(C2033d.class, 2, 0));
        c0574em.a(new i(c.class, 1, 1));
        c0574em.a(new i(qVar, 1, 0));
        c0574em.f8639f = new C1.g(9, qVar);
        arrayList.add(c0574em.b());
        arrayList.add(AbstractC1654b.n("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC1654b.n("fire-core", "20.4.2"));
        arrayList.add(AbstractC1654b.n("device-name", a(Build.PRODUCT)));
        arrayList.add(AbstractC1654b.n("device-model", a(Build.DEVICE)));
        arrayList.add(AbstractC1654b.n("device-brand", a(Build.BRAND)));
        arrayList.add(AbstractC1654b.t("android-target-sdk", new b(5)));
        arrayList.add(AbstractC1654b.t("android-min-sdk", new b(6)));
        arrayList.add(AbstractC1654b.t("android-platform", new b(7)));
        arrayList.add(AbstractC1654b.t("android-installer", new b(8)));
        try {
            J3.a.f1027p.getClass();
            str = "2.0.21";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(AbstractC1654b.n("kotlin", str));
        }
        return arrayList;
    }
}
