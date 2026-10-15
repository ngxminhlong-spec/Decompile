package K;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import com.google.android.gms.internal.measurement.C1500c1;
import java.util.Iterator;
import l.w0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1033a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1034b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C1500c1 c1500c1) {
        super(null);
        this.f1034b = c1500c1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(w0 w0Var) {
        super(new Handler());
        this.f1034b = w0Var;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f1033a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        Cursor cursor;
        switch (this.f1033a) {
            case 0:
                w0 w0Var = (w0) this.f1034b;
                if (!w0Var.f1038p || (cursor = w0Var.f1039q) == null || cursor.isClosed()) {
                    return;
                }
                w0Var.f1037o = w0Var.f1039q.requery();
                return;
            default:
                C1500c1 c1500c1 = (C1500c1) this.f1034b;
                synchronized (c1500c1.f11896e) {
                    c1500c1.f11897f = null;
                    c1500c1.c.run();
                }
                synchronized (c1500c1) {
                    try {
                        Iterator it = c1500c1.f11898g.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
