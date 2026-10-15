package x2;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final String f15430a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15431b;
    public boolean c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T f15432e;

    public Q(T t4, String str, long j4) {
        this.f15432e = t4;
        h2.y.e(str);
        this.f15430a = str;
        this.f15431b = j4;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.f15432e.k().getLong(this.f15430a, this.f15431b);
        }
        return this.d;
    }

    public final void b(long j4) {
        SharedPreferences.Editor edit = this.f15432e.k().edit();
        edit.putLong(this.f15430a, j4);
        edit.apply();
        this.d = j4;
    }
}
