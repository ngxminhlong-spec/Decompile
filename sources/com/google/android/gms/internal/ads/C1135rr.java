package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135rr {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f10538b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f10539a;

    public C1135rr(Handler handler) {
        this.f10539a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0835kr d() {
        C0835kr obj;
        ArrayList arrayList = f10538b;
        synchronized (arrayList) {
            try {
                obj = arrayList.isEmpty() ? new Object() : (C0835kr) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final C0835kr a(int i4, Object obj) {
        C0835kr d = d();
        d.f9326a = this.f10539a.obtainMessage(i4, obj);
        return d;
    }

    public final boolean b(Runnable runnable) {
        return this.f10539a.post(runnable);
    }

    public final boolean c(int i4) {
        return this.f10539a.sendEmptyMessage(i4);
    }
}
