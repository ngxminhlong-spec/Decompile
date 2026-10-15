package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Jd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0293Jd implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5867o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ JsResult f5868p;

    public /* synthetic */ DialogInterfaceOnClickListenerC0293Jd(JsResult jsResult, int i4) {
        this.f5867o = i4;
        this.f5868p = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f5867o) {
            case 0:
                this.f5868p.cancel();
                return;
            default:
                this.f5868p.confirm();
                return;
        }
    }
}
