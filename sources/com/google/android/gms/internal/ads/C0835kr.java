package com.google.android.gms.internal.ads;

import android.os.Message;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.kr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835kr {

    /* renamed from: a, reason: collision with root package name */
    public Message f9326a;

    public final void a() {
        Message message = this.f9326a;
        message.getClass();
        message.sendToTarget();
        b();
    }

    public final void b() {
        this.f9326a = null;
        ArrayList arrayList = C1135rr.f10538b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
