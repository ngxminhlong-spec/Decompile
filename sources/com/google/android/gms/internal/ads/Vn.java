package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Vn implements Fo {

    /* renamed from: a, reason: collision with root package name */
    public final O1.X0 f7283a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7284b;
    public final boolean c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7285e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7286f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7287g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7288h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7289i;

    public Vn(O1.X0 x02, String str, boolean z4, String str2, float f4, int i4, int i5, String str3, boolean z5) {
        h2.y.j(x02, "the adSize must not be null");
        this.f7283a = x02;
        this.f7284b = str;
        this.c = z4;
        this.d = str2;
        this.f7285e = f4;
        this.f7286f = i4;
        this.f7287g = i5;
        this.f7288h = str3;
        this.f7289i = z5;
    }

    @Override // com.google.android.gms.internal.ads.Fo
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        O1.X0 x02 = this.f7283a;
        int i4 = x02.f1326s;
        boolean z4 = x02.f1321C;
        int i5 = x02.f1323p;
        Zf.V(bundle, "smart_w", "full", i4 == -1);
        Zf.V(bundle, "smart_h", "auto", i5 == -2);
        Zf.Y(bundle, "ene", true, x02.f1331x);
        Zf.V(bundle, "rafmt", "102", x02.f1319A);
        Zf.V(bundle, "rafmt", "103", x02.f1320B);
        Zf.V(bundle, "rafmt", "105", z4);
        Zf.Y(bundle, "inline_adaptive_slot", true, this.f7289i);
        Zf.Y(bundle, "interscroller_slot", true, z4);
        Zf.I("format", this.f7284b, bundle);
        Zf.V(bundle, "fluid", "height", this.c);
        Zf.V(bundle, "sz", this.d, !TextUtils.isEmpty(r1));
        bundle.putFloat("u_sd", this.f7285e);
        bundle.putInt("sw", this.f7286f);
        bundle.putInt("sh", this.f7287g);
        Zf.V(bundle, "sc", this.f7288h, !TextUtils.isEmpty(r1));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        O1.X0[] x0Arr = x02.f1328u;
        if (x0Arr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i5);
            bundle2.putInt("width", x02.f1326s);
            bundle2.putBoolean("is_fluid_height", x02.f1330w);
            arrayList.add(bundle2);
        } else {
            for (O1.X0 x03 : x0Arr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", x03.f1330w);
                bundle3.putInt("height", x03.f1323p);
                bundle3.putInt("width", x03.f1326s);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
