package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ve, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354Ve implements InterfaceC0349Ue {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7265a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.K f7266b;

    public /* synthetic */ C0354Ve(Q1.K k3, int i4) {
        this.f7265a = i4;
        this.f7266b = k3;
    }

    private final void b(HashMap hashMap) {
        boolean parseBoolean = Boolean.parseBoolean((String) hashMap.get("content_url_opted_out"));
        Q1.K k3 = this.f7266b;
        k3.r();
        synchronized (k3.f1642a) {
            try {
                if (k3.f1662w == parseBoolean) {
                    return;
                }
                k3.f1662w = parseBoolean;
                SharedPreferences.Editor editor = k3.f1646g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", parseBoolean);
                    k3.f1646g.apply();
                }
                k3.s();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0349Ue
    public final void a(HashMap hashMap) {
        switch (this.f7265a) {
            case 0:
                b(hashMap);
                return;
            default:
                boolean parseBoolean = Boolean.parseBoolean((String) hashMap.get("content_vertical_opted_out"));
                Q1.K k3 = this.f7266b;
                k3.r();
                synchronized (k3.f1642a) {
                    try {
                        if (k3.f1663x == parseBoolean) {
                            return;
                        }
                        k3.f1663x = parseBoolean;
                        SharedPreferences.Editor editor = k3.f1646g;
                        if (editor != null) {
                            editor.putBoolean("content_vertical_opted_out", parseBoolean);
                            k3.f1646g.apply();
                        }
                        k3.s();
                        return;
                    } finally {
                    }
                }
        }
    }
}
