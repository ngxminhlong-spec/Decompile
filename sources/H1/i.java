package H1;

import O1.A0;
import O1.C0081p;
import O1.C0099y0;
import O1.InterfaceC0051a;
import O1.J;
import O1.O0;
import O1.X0;
import android.content.Context;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.AbstractC1249uc;
import com.google.android.gms.internal.ads.C1335wc;
import com.google.android.gms.internal.ads.D4;
import com.google.android.gms.internal.ads.L6;
import com.google.android.gms.internal.ads.Nu;
import com.google.android.gms.internal.ads.Y9;
import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class i extends ViewGroup {

    /* renamed from: o, reason: collision with root package name */
    public final A0 f874o;

    public i(Context context) {
        super(context);
        this.f874o = new A0(this);
    }

    public final void a(e eVar) {
        y.d("#008 Must be called on the main UI thread.");
        AbstractC1066q6.a(getContext());
        if (((Boolean) L6.f6126f.r()).booleanValue()) {
            if (((Boolean) O1.r.d.c.a(AbstractC1066q6.x9)).booleanValue()) {
                AbstractC1249uc.f10789b.execute(new Nu(22, this, eVar));
                return;
            }
        }
        this.f874o.e(eVar.f863a);
    }

    public b getAdListener() {
        return (b) this.f874o.f1256f;
    }

    public f getAdSize() {
        X0 h4;
        A0 a02 = this.f874o;
        a02.getClass();
        try {
            J j4 = (J) a02.f1259i;
            if (j4 != null && (h4 = j4.h()) != null) {
                return new f(h4.f1326s, h4.f1323p, h4.f1322o);
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
        f[] fVarArr = (f[]) a02.f1257g;
        if (fVarArr != null) {
            return fVarArr[0];
        }
        return null;
    }

    public String getAdUnitId() {
        J j4;
        A0 a02 = this.f874o;
        if (((String) a02.f1260j) == null && (j4 = (J) a02.f1259i) != null) {
            try {
                a02.f1260j = j4.C();
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            }
        }
        return (String) a02.f1260j;
    }

    public l getOnPaidEventListener() {
        this.f874o.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H1.n getResponseInfo() {
        /*
            r3 = this;
            O1.A0 r0 = r3.f874o
            r0.getClass()
            r1 = 0
            java.lang.Object r0 = r0.f1259i     // Catch: android.os.RemoteException -> L11
            O1.J r0 = (O1.J) r0     // Catch: android.os.RemoteException -> L11
            if (r0 == 0) goto L13
            O1.q0 r0 = r0.k()     // Catch: android.os.RemoteException -> L11
            goto L1b
        L11:
            r0 = move-exception
            goto L15
        L13:
            r0 = r1
            goto L1b
        L15:
            java.lang.String r2 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.Y9.u(r2, r0)
            goto L13
        L1b:
            if (r0 == 0) goto L22
            H1.n r1 = new H1.n
            r1.<init>(r0)
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.i.getResponseInfo():H1.n");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i8 = ((i6 - i4) - measuredWidth) / 2;
        int i9 = ((i7 - i5) - measuredHeight) / 2;
        childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        f fVar;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                fVar = getAdSize();
            } catch (NullPointerException e4) {
                Y9.q("Unable to retrieve ad size.", e4);
                fVar = null;
            }
            if (fVar != null) {
                Context context = getContext();
                int i10 = fVar.f867a;
                if (i10 == -3) {
                    i7 = -1;
                } else if (i10 != -1) {
                    C1335wc c1335wc = C0081p.f1374f.f1375a;
                    i7 = C1335wc.l(context, i10);
                } else {
                    i7 = context.getResources().getDisplayMetrics().widthPixels;
                }
                int i11 = fVar.f868b;
                if (i11 == -4 || i11 == -3) {
                    i8 = -1;
                } else if (i11 != -2) {
                    C1335wc c1335wc2 = C0081p.f1374f.f1375a;
                    i8 = C1335wc.l(context, i11);
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f4 = displayMetrics.heightPixels;
                    float f5 = displayMetrics.density;
                    int i12 = (int) (f4 / f5);
                    i8 = (int) ((i12 <= 400 ? 32 : i12 <= 720 ? 50 : 90) * f5);
                }
                i6 = i8;
                i9 = i7;
            } else {
                i6 = 0;
            }
        } else {
            measureChild(childAt, i4, i5);
            i9 = childAt.getMeasuredWidth();
            i6 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i9, getSuggestedMinimumWidth()), i4), View.resolveSize(Math.max(i6, getSuggestedMinimumHeight()), i5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(b bVar) {
        A0 a02 = this.f874o;
        a02.f1256f = bVar;
        C0099y0 c0099y0 = (C0099y0) a02.d;
        synchronized (c0099y0.f1402o) {
            c0099y0.f1403p = bVar;
        }
        if (bVar == 0) {
            this.f874o.f(null);
            return;
        }
        if (bVar instanceof InterfaceC0051a) {
            this.f874o.f((InterfaceC0051a) bVar);
        }
        if (bVar instanceof I1.b) {
            A0 a03 = this.f874o;
            I1.b bVar2 = (I1.b) bVar;
            a03.getClass();
            try {
                a03.f1258h = bVar2;
                J j4 = (J) a03.f1259i;
                if (j4 != null) {
                    j4.r1(new D4(bVar2));
                }
            } catch (RemoteException e4) {
                Y9.u("#007 Could not call remote method.", e4);
            }
        }
    }

    public void setAdSize(f fVar) {
        f[] fVarArr = {fVar};
        A0 a02 = this.f874o;
        if (((f[]) a02.f1257g) != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        i iVar = (i) a02.f1261k;
        a02.f1257g = fVarArr;
        try {
            J j4 = (J) a02.f1259i;
            if (j4 != null) {
                j4.O2(A0.a(iVar.getContext(), (f[]) a02.f1257g));
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
        iVar.requestLayout();
    }

    public void setAdUnitId(String str) {
        A0 a02 = this.f874o;
        if (((String) a02.f1260j) != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        a02.f1260j = str;
    }

    public void setOnPaidEventListener(l lVar) {
        A0 a02 = this.f874o;
        a02.getClass();
        try {
            J j4 = (J) a02.f1259i;
            if (j4 != null) {
                j4.f3(new O0());
            }
        } catch (RemoteException e4) {
            Y9.u("#007 Could not call remote method.", e4);
        }
    }
}
