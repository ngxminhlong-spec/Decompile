package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.nv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0968nv {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f9782a = new CopyOnWriteArrayList();

    public static void a(String str) {
        Iterator it = f9782a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
