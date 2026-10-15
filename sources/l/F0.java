package l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import k.C1744a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class F0 implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final C1744a f13600o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G0 f13601p;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k.a] */
    public F0(G0 g02) {
        this.f13601p = g02;
        Context context = g02.f13603a.getContext();
        CharSequence charSequence = g02.f13608h;
        ?? obj = new Object();
        obj.f13370e = 4096;
        obj.f13372g = 4096;
        obj.f13377l = null;
        obj.f13378m = null;
        obj.f13379n = false;
        obj.f13380o = false;
        obj.f13381p = 16;
        obj.f13374i = context;
        obj.f13368a = charSequence;
        this.f13600o = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        G0 g02 = this.f13601p;
        Window.Callback callback = g02.f13611k;
        if (callback == null || !g02.f13612l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f13600o);
    }
}
