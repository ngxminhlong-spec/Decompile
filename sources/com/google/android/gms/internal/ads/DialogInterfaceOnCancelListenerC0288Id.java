package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0288Id implements DialogInterface.OnCancelListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5576o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f5577p;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0288Id(int i4, Object obj) {
        this.f5576o = i4;
        this.f5577p = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f5576o) {
            case 0:
                ((JsResult) this.f5577p).cancel();
                return;
            case 1:
                ((JsPromptResult) this.f5577p).cancel();
                return;
            default:
                P1.a aVar = (P1.a) this.f5577p;
                if (aVar != null) {
                    aVar.c();
                    return;
                }
                return;
        }
    }
}
