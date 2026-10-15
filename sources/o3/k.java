package o3;

import com.google.android.gms.internal.ads.Jn;
import h2.y;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: t, reason: collision with root package name */
    public static final Logger f14364t = Logger.getLogger(k.class.getName());

    /* renamed from: o, reason: collision with root package name */
    public final Executor f14365o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayDeque f14366p = new ArrayDeque();

    /* renamed from: q, reason: collision with root package name */
    public int f14367q = 1;

    /* renamed from: r, reason: collision with root package name */
    public long f14368r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final Jn f14369s = new Jn(this);

    public k(Executor executor) {
        y.i(executor);
        this.f14365o = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y.i(runnable);
        synchronized (this.f14366p) {
            int i4 = this.f14367q;
            if (i4 != 4 && i4 != 3) {
                long j4 = this.f14368r;
                j jVar = new j(runnable, 0);
                this.f14366p.add(jVar);
                this.f14367q = 2;
                try {
                    this.f14365o.execute(this.f14369s);
                    if (this.f14367q != 2) {
                        return;
                    }
                    synchronized (this.f14366p) {
                        try {
                            if (this.f14368r == j4 && this.f14367q == 2) {
                                this.f14367q = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e4) {
                    synchronized (this.f14366p) {
                        try {
                            int i5 = this.f14367q;
                            boolean z4 = true;
                            if ((i5 != 1 && i5 != 2) || !this.f14366p.removeLastOccurrence(jVar)) {
                                z4 = false;
                            }
                            if (!(e4 instanceof RejectedExecutionException) || z4) {
                                throw e4;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f14366p.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f14365o + "}";
    }
}
