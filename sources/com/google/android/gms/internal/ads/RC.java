package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class RC implements InterfaceC1132ro {

    /* renamed from: o, reason: collision with root package name */
    public Object f6796o;

    public /* synthetic */ RC(Object obj) {
        this.f6796o = obj;
    }

    public void a(Exception exc) {
        Wj.i("MediaCodecAudioRenderer", "Audio sink error", exc);
        C0831kn c0831kn = ((C1416yD) this.f6796o).N0;
        Handler handler = (Handler) c0831kn.f9319p;
        if (handler != null) {
            handler.post(new RunnableC0645gD(c0831kn, exc, 6));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1132ro
    /* renamed from: l */
    public void mo6l(Object obj) {
        ((PC) obj).h((VB) this.f6796o);
    }
}
