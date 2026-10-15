package androidx.fragment.app;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Fragment$2 implements androidx.lifecycle.h {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0157f f2758o;

    public Fragment$2(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        this.f2758o = abstractComponentCallbacksC0157f;
    }

    @Override // androidx.lifecycle.h
    public final void a(androidx.lifecycle.i iVar, androidx.lifecycle.f fVar) {
        View view;
        if (fVar != androidx.lifecycle.f.ON_STOP || (view = this.f2758o.f2835R) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
