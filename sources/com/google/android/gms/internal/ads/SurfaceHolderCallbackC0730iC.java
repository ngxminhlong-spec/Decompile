package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.iC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0730iC implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0857lC f9035o;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
        Surface surface = new Surface(surfaceTexture);
        C0857lC c0857lC = this.f9035o;
        c0857lC.A1(surface);
        c0857lC.f9402V = surface;
        c0857lC.y1(i4, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0857lC c0857lC = this.f9035o;
        c0857lC.A1(null);
        c0857lC.y1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
        this.f9035o.y1(i4, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        this.f9035o.y1(i5, i6);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f9035o.y1(0, 0);
    }
}
