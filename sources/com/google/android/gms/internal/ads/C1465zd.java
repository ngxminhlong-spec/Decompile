package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1465zd extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f11593a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0243Ad f11594b;

    public C1465zd(C0243Ad c0243Ad) {
        this.f11594b = c0243Ad;
    }

    public final void a(Socket socket) {
        C0243Ad c0243Ad = this.f11594b;
        int i4 = c0243Ad.f3954F;
        if (i4 > 0) {
            socket.setReceiveBufferSize(i4);
        }
        c0243Ad.f3955G.add(socket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i4) {
        Socket createSocket = this.f11593a.createSocket(str, i4);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i4, InetAddress inetAddress, int i5) {
        Socket createSocket = this.f11593a.createSocket(str, i4, inetAddress, i5);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i4) {
        Socket createSocket = this.f11593a.createSocket(inetAddress, i4);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i4, InetAddress inetAddress2, int i5) {
        Socket createSocket = this.f11593a.createSocket(inetAddress, i4, inetAddress2, i5);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i4, boolean z4) {
        Socket createSocket = this.f11593a.createSocket(socket, str, i4, z4);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f11593a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f11593a.getSupportedCipherSuites();
    }
}
