package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public enum Q5 implements Fz {
    f6638p("UNSPECIFIED"),
    f6639q("CONNECTING"),
    f6640r("CONNECTED"),
    f6641s("DISCONNECTING"),
    f6642t("DISCONNECTED"),
    f6643u("SUSPENDED");


    /* renamed from: o, reason: collision with root package name */
    public final int f6645o;

    Q5(String str) {
        this.f6645o = r2;
    }

    public static Q5 a(int i4) {
        if (i4 == 0) {
            return f6638p;
        }
        if (i4 == 1) {
            return f6639q;
        }
        if (i4 == 2) {
            return f6640r;
        }
        if (i4 == 3) {
            return f6641s;
        }
        if (i4 == 4) {
            return f6642t;
        }
        if (i4 != 5) {
            return null;
        }
        return f6643u;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f6645o);
    }
}
