package b0;

import android.view.View;
import com.google.android.gms.internal.ads.Zf;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3415a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f3416b;
    public boolean c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int f3417e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3418f;

    public C0208u() {
        d();
    }

    public C0208u(int i4) {
        this.f3416b = i4;
        byte[] bArr = new byte[131];
        this.f3418f = bArr;
        bArr[2] = 1;
    }

    public void a() {
        this.f3417e = this.c ? ((C0167A) this.f3418f).g() : ((C0167A) this.f3418f).j();
    }

    public void b(View view, int i4) {
        if (this.c) {
            int b4 = ((C0167A) this.f3418f).b(view);
            C0167A c0167a = (C0167A) this.f3418f;
            this.f3417e = (Integer.MIN_VALUE == c0167a.f3171b ? 0 : c0167a.k() - c0167a.f3171b) + b4;
        } else {
            this.f3417e = ((C0167A) this.f3418f).e(view);
        }
        this.f3416b = i4;
    }

    public void c(View view, int i4) {
        C0167A c0167a = (C0167A) this.f3418f;
        int k3 = Integer.MIN_VALUE == c0167a.f3171b ? 0 : c0167a.k() - c0167a.f3171b;
        if (k3 >= 0) {
            b(view, i4);
            return;
        }
        this.f3416b = i4;
        if (!this.c) {
            int e4 = ((C0167A) this.f3418f).e(view);
            int j4 = e4 - ((C0167A) this.f3418f).j();
            this.f3417e = e4;
            if (j4 > 0) {
                int g4 = (((C0167A) this.f3418f).g() - Math.min(0, (((C0167A) this.f3418f).g() - k3) - ((C0167A) this.f3418f).b(view))) - (((C0167A) this.f3418f).c(view) + e4);
                if (g4 < 0) {
                    this.f3417e -= Math.min(j4, -g4);
                    return;
                }
                return;
            }
            return;
        }
        int g5 = (((C0167A) this.f3418f).g() - k3) - ((C0167A) this.f3418f).b(view);
        this.f3417e = ((C0167A) this.f3418f).g() - g5;
        if (g5 > 0) {
            int c = this.f3417e - ((C0167A) this.f3418f).c(view);
            int j5 = ((C0167A) this.f3418f).j();
            int min = c - (Math.min(((C0167A) this.f3418f).e(view) - j5, 0) + j5);
            if (min < 0) {
                this.f3417e = Math.min(g5, -min) + this.f3417e;
            }
        }
    }

    public void d() {
        this.f3416b = -1;
        this.f3417e = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
    }

    public void e(byte[] bArr, int i4, int i5) {
        if (this.c) {
            int i6 = i5 - i4;
            byte[] bArr2 = (byte[]) this.f3418f;
            int length = bArr2.length;
            int i7 = this.f3417e + i6;
            if (length < i7) {
                this.f3418f = Arrays.copyOf(bArr2, i7 + i7);
            }
            System.arraycopy(bArr, i4, (byte[]) this.f3418f, this.f3417e, i6);
            this.f3417e += i6;
        }
    }

    public void f() {
        this.c = false;
        this.d = false;
    }

    public void g(int i4) {
        Zf.X(!this.c);
        boolean z4 = i4 == this.f3416b;
        this.c = z4;
        if (z4) {
            this.f3417e = 3;
            this.d = false;
        }
    }

    public boolean h(int i4) {
        if (!this.c) {
            return false;
        }
        this.f3417e -= i4;
        this.c = false;
        this.d = true;
        return true;
    }

    public String toString() {
        switch (this.f3415a) {
            case 0:
                return "AnchorInfo{mPosition=" + this.f3416b + ", mCoordinate=" + this.f3417e + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }
}
