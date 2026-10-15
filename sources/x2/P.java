package x2;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final String f15425a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15426b;
    public boolean c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T f15427e;

    public P(T t4, String str, boolean z4) {
        this.f15427e = t4;
        h2.y.e(str);
        this.f15425a = str;
        this.f15426b = z4;
    }

    public final void a(boolean z4) {
        SharedPreferences.Editor edit = this.f15427e.k().edit();
        edit.putBoolean(this.f15425a, z4);
        edit.apply();
        this.d = z4;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.f15427e.k().getBoolean(this.f15425a, this.f15426b);
        }
        return this.d;
    }
}
