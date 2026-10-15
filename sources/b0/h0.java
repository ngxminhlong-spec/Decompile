package b0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3292a;

    /* renamed from: b, reason: collision with root package name */
    public int f3293b;
    public boolean c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3294e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3296g;

    public h0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f3296g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f3292a = -1;
        this.f3293b = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
        this.f3294e = false;
        int[] iArr = this.f3295f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
