package e1;

import D0.o;
import android.os.Handler;
import java.util.ArrayList;
import q1.AbstractC1955j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f12699a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f12700b;
    public boolean c;
    public int d;

    /* renamed from: g, reason: collision with root package name */
    public long f12703g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12705i;

    /* renamed from: j, reason: collision with root package name */
    public long f12706j;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f12701e = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public float f12704h = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public final o f12707k = new o(23, this);

    /* renamed from: f, reason: collision with root package name */
    public final int f12702f = 1;

    public f(Handler handler) {
        this.f12700b = handler;
    }

    public final void a() {
        float f4 = (float) this.f12699a;
        this.f12699a = 0L;
        this.f12703g = 0L;
        ArrayList arrayList = this.f12701e;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            long a4 = 1000000.0f / (((e) obj).a() * this.f12702f);
            long j4 = this.f12699a;
            if (j4 != 0) {
                if (a4 == 0) {
                    a4 = j4;
                } else {
                    while (j4 != a4) {
                        if (j4 > a4) {
                            j4 -= a4;
                        } else {
                            a4 -= j4;
                        }
                    }
                }
            }
            this.f12699a = a4;
        }
        float f5 = (float) this.f12699a;
        float f6 = f5 / 1000.0f;
        int i5 = (int) f6;
        this.d = i5;
        int i6 = AbstractC1955j.f14675a;
        if (i5 < 16) {
            this.d = 16;
        }
        this.f12704h = this.d / f6;
        if (f4 == f5 || !this.c) {
            return;
        }
        Handler handler = this.f12700b;
        o oVar = this.f12707k;
        handler.removeCallbacks(oVar);
        handler.postDelayed(oVar, this.d);
    }
}
