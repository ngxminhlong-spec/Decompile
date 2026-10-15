package G2;

import H.A;
import android.view.View;
import com.google.android.gms.internal.ads.C1427yi;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f774o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final View f775p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f776q;

    /* renamed from: r, reason: collision with root package name */
    public int f777r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f778s;

    public /* synthetic */ f(C1427yi c1427yi, View view, boolean z4, int i4) {
        this.f778s = c1427yi;
        this.f775p = view;
        this.f776q = z4;
        this.f777r = i4;
    }

    public f(BottomSheetBehavior bottomSheetBehavior, View view, int i4) {
        this.f778s = bottomSheetBehavior;
        this.f775p = view;
        this.f777r = i4;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.android.gms.internal.ads.Ui, com.google.android.gms.internal.ads.s4] */
    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f774o;
        Object obj = this.f778s;
        switch (i4) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                M.e eVar = bottomSheetBehavior.y;
                if (eVar == null || !eVar.g()) {
                    bottomSheetBehavior.A(this.f777r);
                } else {
                    WeakHashMap weakHashMap = A.f779a;
                    this.f775p.postOnAnimation(this);
                }
                this.f776q = false;
                return;
            default:
                C1427yi c1427yi = (C1427yi) obj;
                boolean z4 = this.f776q;
                int i5 = this.f777r;
                c1427yi.f11436l.h(this.f775p, c1427yi.f11445u.d(), c1427yi.f11445u.l(), c1427yi.f11445u.q(), z4, c1427yi.r(), i5);
                return;
        }
    }
}
