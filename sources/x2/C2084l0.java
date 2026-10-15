package x2;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2084l0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15727a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15728b;
    public final String c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f15729e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15730f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.O f15731g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15732h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f15733i;

    /* renamed from: j, reason: collision with root package name */
    public final String f15734j;

    public C2084l0(Context context, com.google.android.gms.internal.measurement.O o4, Long l4) {
        this.f15732h = true;
        h2.y.i(context);
        Context applicationContext = context.getApplicationContext();
        h2.y.i(applicationContext);
        this.f15727a = applicationContext;
        this.f15733i = l4;
        if (o4 != null) {
            this.f15731g = o4;
            this.f15728b = o4.f11793t;
            this.c = o4.f11792s;
            this.d = o4.f11791r;
            this.f15732h = o4.f11790q;
            this.f15730f = o4.f11789p;
            this.f15734j = o4.f11795v;
            Bundle bundle = o4.f11794u;
            if (bundle != null) {
                this.f15729e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
