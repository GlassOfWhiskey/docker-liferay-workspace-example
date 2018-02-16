FROM glassofwhiskey/liferay-portal:7.0-ce-ga5
LABEL maintainer="GlassOfWhiskey <iacopo.c92@gmail.com>"

COPY ./bundles/osgi/configs/ /usr/local/liferay-ce-portal-7.0-ga5/osgi/configs/
COPY ./bundles/osgi/marketplace/ /usr/local/liferay-ce-portal-7.0-ga5/osgi/marketplace/
COPY ./bundles/osgi/modules/ /usr/local/liferay-ce-portal-7.0-ga5/osgi/modules/
COPY ./bundles/osgi/war/ /usr/local/liferay-ce-portal-7.0-ga5/osgi/war/
COPY ./bundles/deploy /usr/local/liferay-ce-portal-7.0-ga5/deploy
COPY ./bundles/portal-ext.properties /usr/local/liferay-ce-portal-7.0-ga5/portal-ext.properties

USER root

RUN chown -R liferay:liferay /usr/local/liferay-ce-portal-7.0-ga5/

USER liferay