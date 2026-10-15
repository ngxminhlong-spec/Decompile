package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.ha, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0691ha implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8937o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f8938p;

    public /* synthetic */ DialogInterfaceOnClickListenerC0691ha(int i4, Object obj) {
        this.f8937o = i4;
        this.f8938p = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f8937o) {
            case 0:
                ((C0734ia) this.f8938p).G("User canceled the download.");
                return;
            default:
                ((JsPromptResult) this.f8938p).cancel();
                return;
        }
    }
}
