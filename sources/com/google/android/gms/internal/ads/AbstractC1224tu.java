package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tu */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1224tu {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractC1138ru abstractC1138ru, long j4, Object obj, Object obj2) {
        while (!AbstractC1181su.a(unsafe, abstractC1138ru, j4, obj, obj2)) {
            if (unsafe.getObject(abstractC1138ru, j4) != obj) {
                return false;
            }
        }
        return true;
    }
}
