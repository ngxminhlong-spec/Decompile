package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Wn implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7568b;

    public /* synthetic */ Wn(int i4, ArrayList arrayList) {
        this.f7567a = i4;
        this.f7568b = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        switch (this.f7567a) {
            case 0:
                bundle.putStringArrayList("ad_types", this.f7568b);
                return;
            default:
                bundle.putStringArrayList("android_permissions", this.f7568b);
                return;
        }
    }
}
