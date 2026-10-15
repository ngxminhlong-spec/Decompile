package K;

import android.database.DataSetObserver;
import l.C1764e0;
import l.w0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1036b;

    public /* synthetic */ b(int i4, Object obj) {
        this.f1035a = i4;
        this.f1036b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f1035a) {
            case 0:
                w0 w0Var = (w0) this.f1036b;
                w0Var.f1037o = true;
                w0Var.notifyDataSetChanged();
                return;
            default:
                C1764e0 c1764e0 = (C1764e0) this.f1036b;
                if (c1764e0.f13740M.isShowing()) {
                    c1764e0.e();
                    return;
                }
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f1035a) {
            case 0:
                w0 w0Var = (w0) this.f1036b;
                w0Var.f1037o = false;
                w0Var.notifyDataSetInvalidated();
                return;
            default:
                ((C1764e0) this.f1036b).dismiss();
                return;
        }
    }
}
