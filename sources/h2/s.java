package h2;

import android.os.Bundle;
import e2.C1664b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f13241a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13242b;
    public final /* synthetic */ AbstractC1706e c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f13243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC1706e f13244f;

    public s(AbstractC1706e abstractC1706e, int i4, Bundle bundle) {
        this.f13244f = abstractC1706e;
        Boolean bool = Boolean.TRUE;
        this.c = abstractC1706e;
        this.f13241a = bool;
        this.f13242b = false;
        this.d = i4;
        this.f13243e = bundle;
    }

    public abstract void a(C1664b c1664b);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f13241a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.c.f13184z) {
            this.c.f13184z.remove(this);
        }
    }
}
