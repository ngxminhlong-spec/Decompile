package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1090qo implements Fo {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1090qo f10404b = new C1090qo(0);
    public static final /* synthetic */ C1090qo c = new C1090qo(1);
    public static final /* synthetic */ C1090qo d = new C1090qo(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1090qo f10405e = new C1090qo(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1090qo f10406f = new C1090qo(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10407a;

    public /* synthetic */ C1090qo(int i4) {
        this.f10407a = i4;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        switch (this.f10407a) {
            case 0:
                return;
            case 1:
                ((Bundle) obj).putInt("native_version", 0);
                return;
            case 2:
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
                return;
            case 3:
                return;
            case 4:
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
                    return;
                } catch (JSONException unused) {
                    return;
                }
            default:
                return;
        }
    }
}
