package q1;

import android.os.Handler;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.google.android.gms.internal.ads.Tw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: q1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1952g implements B0.e, B0.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Tw f14664a;

    public /* synthetic */ C1952g(Tw tw) {
        this.f14664a = tw;
    }

    @Override // B0.e
    public void a(B0.d dVar, List list) {
        Tw tw = this.f14664a;
        ((Handler) tw.d).post(new RunnableC1950e(tw.f7098a, dVar, list, (B0.b) tw.c, (boolean[]) tw.f7100e, (B1.a) tw.f7101f, 1));
    }

    @Override // B0.g
    public void b(B0.d dVar, ArrayList arrayList) {
        Tw tw = this.f14664a;
        ((Handler) tw.d).post(new RunnableC1953h(tw.f7098a, dVar, (MainActivity) tw.f7099b, arrayList, (B1.a) tw.f7101f, 1));
    }
}
